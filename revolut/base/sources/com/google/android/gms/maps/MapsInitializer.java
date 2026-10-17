package com.google.android.gms.maps;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class MapsInitializer {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static boolean f46600zzb;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final String f46599zza = "MapsInitializer";

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static Renderer f46601zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(@NonNull Context context) {
        return initialize(context, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[Catch: all -> 0x0022, RemoteException -> 0x0054, TryCatch #3 {RemoteException -> 0x0054, blocks: (B:23:0x0049, B:25:0x004f, B:28:0x0056), top: B:50:0x0049, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001c, B:13:0x0026, B:14:0x002a, B:16:0x0039, B:18:0x003e, B:23:0x0049, B:25:0x004f, B:28:0x0056, B:31:0x0063, B:33:0x0074, B:30:0x005e, B:37:0x007c, B:38:0x0081, B:40:0x0083), top: B:45:0x0003, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int initialize(@androidx.annotation.NonNull android.content.Context r5, com.google.android.gms.maps.MapsInitializer.Renderer r6, com.google.android.gms.maps.OnMapsSdkInitializedCallback r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = com.google.android.gms.maps.MapsInitializer.f46599zza     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L22
            boolean r1 = com.google.android.gms.maps.MapsInitializer.f46600zzb     // Catch: java.lang.Throwable -> L22
            r2 = 0
            if (r1 == 0) goto L26
            if (r7 == 0) goto L24
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.f46601zzc     // Catch: java.lang.Throwable -> L22
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r5 = move-exception
            goto L87
        L24:
            monitor-exit(r0)
            return r2
        L26:
            com.google.android.gms.maps.internal.zzf r1 = com.google.android.gms.maps.internal.zzcc.zza(r5, r6)     // Catch: java.lang.Throwable -> L22 com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L82
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = r1.zze()     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L7b
            com.google.android.gms.maps.CameraUpdateFactory.zza(r3)     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L7b
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L7b
            com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(r3)     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L7b
            r3 = 1
            com.google.android.gms.maps.MapsInitializer.f46600zzb = r3     // Catch: java.lang.Throwable -> L22
            r4 = 2
            if (r6 == 0) goto L46
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L49
            if (r6 == r3) goto L48
        L46:
            r3 = r2
            goto L49
        L48:
            r3 = r4
        L49:
            int r6 = r1.zzd()     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L54
            if (r6 != r4) goto L56
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L54
            com.google.android.gms.maps.MapsInitializer.f46601zzc = r6     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L5e
        L56:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L54
            r1.zzl(r5, r3)     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L54
            goto L63
        L5e:
            java.lang.String r6 = com.google.android.gms.maps.MapsInitializer.f46599zza     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
        L63:
            java.lang.String r5 = com.google.android.gms.maps.MapsInitializer.f46599zza     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.f46601zzc     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L79
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.f46601zzc     // Catch: java.lang.Throwable -> L22
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L22
        L79:
            monitor-exit(r0)
            return r2
        L7b:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L22
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L22
            throw r6     // Catch: java.lang.Throwable -> L22
        L82:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            return r5
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
