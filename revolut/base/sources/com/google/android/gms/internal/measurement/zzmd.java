package com.google.android.gms.internal.measurement;

import a0.d;
import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmd;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzmd<MessageType extends zzmd<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> extends zzko<MessageType, BuilderType> {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Map f40458zzb = new ConcurrentHashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40460zzd = -1;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    protected zzof f40459zzc = zzof.zzc();

    private final int zzc(zzns zznsVar) {
        return zznp.zza().zzb(getClass()).zza(this);
    }

    public static zzmd zzci(Class cls) {
        Map map = f40458zzb;
        zzmd zzmdVar = (zzmd) map.get(cls);
        if (zzmdVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzmdVar = (zzmd) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzmdVar != null) {
            return zzmdVar;
        }
        zzmd zzmdVar2 = (zzmd) ((zzmd) zzol.zze(cls)).zzl(6, null, null);
        if (zzmdVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzmdVar2);
        return zzmdVar2;
    }

    public static zzmh zzck() {
        return zzme.zzf();
    }

    public static zzmi zzcl() {
        return zzmw.zzf();
    }

    public static zzmi zzcm(zzmi zzmiVar) {
        int size = zzmiVar.size();
        return zzmiVar.zzd(size + size);
    }

    public static zzmj zzcn() {
        return zznq.zze();
    }

    public static zzmj zzco(zzmj zzmjVar) {
        int size = zzmjVar.size();
        return zzmjVar.zzd(size + size);
    }

    public static Object zzcp(Method method, Object obj2, Object... objArr) {
        try {
            return method.invoke(obj2, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzcq(zznh zznhVar, String str, Object[] objArr) {
        return new zznr(zznhVar, str, objArr);
    }

    public static void zzct(Class cls, zzmd zzmdVar) {
        zzmdVar.zzcs();
        f40458zzb.put(cls, zzmdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(zzmd zzmdVar, boolean z) {
        byte bByteValue = ((Byte) zzmdVar.zzl(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zznp.zza().zzb(zzmdVar.getClass()).zzk(zzmdVar);
        if (z) {
            zzmdVar.zzl(2, true != zZzk ? null : zzmdVar, null);
        }
        return zZzk;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        return zznp.zza().zzb(getClass()).zzj(this, (zzmd) obj2);
    }

    public final int hashCode() {
        if (zzcw()) {
            return zzce();
        }
        int i = this.f40389zza;
        if (i != 0) {
            return i;
        }
        int iZzce = zzce();
        this.f40389zza = iZzce;
        return iZzce;
    }

    public final String toString() {
        return zznj.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final /* synthetic */ zzng zzcA() {
        return (zzlz) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final void zzcB(zzlk zzlkVar) throws IOException {
        zznp.zza().zzb(getClass()).zzi(this, zzll.zza(zzlkVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final /* synthetic */ zznh zzcC() {
        return (zzmd) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zzcD() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final int zzca(zzns zznsVar) {
        if (zzcw()) {
            int iZza = zznsVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(d.n("serialized size must be non-negative, was ", iZza));
        }
        int i = this.f40460zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zznsVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(d.n("serialized size must be non-negative, was ", iZza2));
        }
        this.f40460zzd = (this.f40460zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    public final int zzce() {
        return zznp.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final int zzcf() {
        if (zzcw()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(d.n("serialized size must be non-negative, was ", iZzc));
        }
        int i = this.f40460zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 < 0) {
            throw new IllegalStateException(d.n("serialized size must be non-negative, was ", iZzc2));
        }
        this.f40460zzd = (this.f40460zzd & Integer.MIN_VALUE) | iZzc2;
        return iZzc2;
    }

    public final zzlz zzcg() {
        return (zzlz) zzl(5, null, null);
    }

    public final zzlz zzch() {
        zzlz zzlzVar = (zzlz) zzl(5, null, null);
        zzlzVar.zzaY(this);
        return zzlzVar;
    }

    public final zzmd zzcj() {
        return (zzmd) zzl(4, null, null);
    }

    public final void zzcr() {
        zznp.zza().zzb(getClass()).zzf(this);
        zzcs();
    }

    public final void zzcs() {
        this.f40460zzd &= Integer.MAX_VALUE;
    }

    public final void zzcu(int i) {
        this.f40460zzd = (this.f40460zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzcw() {
        return (this.f40460zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzl(int i, Object obj2, Object obj3);
}
