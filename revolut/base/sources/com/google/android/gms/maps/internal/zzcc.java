package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final String f46620zza = "zzcc";

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static Context f46621zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static zzf f46622zzc;

    public static zzf zza(Context context, MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        Preconditions.checkNotNull(context);
        String str = f46620zza;
        "preferredRenderer: ".concat(String.valueOf(renderer));
        zzf zzfVar = f46622zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (iIsGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
        zzf zzfVarZzd = zzd(context, renderer);
        f46622zzc = zzfVarZzd;
        try {
            if (zzfVarZzd.zzd() == 2) {
                try {
                    f46622zzc.zzm(ObjectWrapper.wrap(zzc(context, renderer)));
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (UnsatisfiedLinkError unused) {
                    String str2 = f46620zza;
                    f46621zzb = null;
                    f46622zzc = zzd(context, MapsInitializer.Renderer.LEGACY);
                }
            }
            try {
                zzf zzfVar2 = f46622zzc;
                Context contextZzc = zzc(context, renderer);
                contextZzc.getClass();
                zzfVar2.zzk(ObjectWrapper.wrap(contextZzc.getResources()), 18020000);
                return f46622zzc;
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    private static Context zzb(Exception exc2, Context context) {
        String str = f46620zza;
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    private static Context zzc(Context context, MapsInitializer.Renderer renderer) {
        Context contextZzb;
        Context context2 = f46621zzb;
        if (context2 != null) {
            return context2;
        }
        String str = renderer == MapsInitializer.Renderer.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
        } catch (Exception e) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextZzb = zzb(e, context);
            } else {
                try {
                    String str2 = f46620zza;
                    contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
                } catch (Exception e2) {
                    contextZzb = zzb(e2, context);
                }
            }
        }
        f46621zzb = contextZzb;
        return contextZzb;
    }

    private static zzf zzd(Context context, MapsInitializer.Renderer renderer) {
        String str = f46620zza;
        try {
            IBinder iBinder = (IBinder) zze(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zze(iBinder);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }

    private static Object zze(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e2);
        }
    }
}
