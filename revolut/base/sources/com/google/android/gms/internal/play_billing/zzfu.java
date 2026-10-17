package com.google.android.gms.internal.play_billing;

import a0.d;
import com.google.android.gms.internal.play_billing.zzfq;
import com.google.android.gms.internal.play_billing.zzfu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzfu<MessageType extends zzfu<MessageType, BuilderType>, BuilderType extends zzfq<MessageType, BuilderType>> extends zzeg<MessageType, BuilderType> {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Map f46021zzb = new ConcurrentHashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46023zzd = -1;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    protected zzic f46022zzc = zzic.zzc();

    public static void zzB(Class cls, zzfu zzfuVar) {
        zzfuVar.zzA();
        f46021zzb.put(cls, zzfuVar);
    }

    private final int zza(zzhl zzhlVar) {
        return zzhi.zza().zzb(getClass()).zza(this);
    }

    private static zzfu zzb(zzfu zzfuVar, byte[] bArr, int i, int i2, zzfh zzfhVar) throws zzgc {
        if (i2 == 0) {
            return zzfuVar;
        }
        zzfu zzfuVarZzs = zzfuVar.zzs();
        try {
            zzhl zzhlVarZzb = zzhi.zza().zzb(zzfuVarZzs.getClass());
            zzhlVarZzb.zzh(zzfuVarZzs, bArr, 0, i2, new zzej(zzfhVar));
            zzhlVarZzb.zzf(zzfuVarZzs);
            return zzfuVarZzs;
        } catch (zzgc e) {
            throw e;
        } catch (zzia e2) {
            throw e2.zza();
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgc) {
                throw ((zzgc) e4.getCause());
            }
            throw new zzgc(e4);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzc(zzfu zzfuVar, boolean z) {
        byte bByteValue = ((Byte) zzfuVar.zzd(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzhi.zza().zzb(zzfuVar.getClass()).zzk(zzfuVar);
        if (z) {
            zzfuVar.zzd(2, true != zZzk ? null : zzfuVar, null);
        }
        return zZzk;
    }

    public static zzfu zzr(Class cls) {
        Map map = f46021zzb;
        zzfu zzfuVar = (zzfu) map.get(cls);
        if (zzfuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfuVar = (zzfu) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfuVar != null) {
            return zzfuVar;
        }
        zzfu zzfuVar2 = (zzfu) ((zzfu) zzii.zze(cls)).zzd(6, null, null);
        if (zzfuVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzfuVar2);
        return zzfuVar2;
    }

    public static zzfu zzt(zzfu zzfuVar, byte[] bArr) throws zzgc {
        int length = bArr.length;
        int i = zzfh.f45994zzb;
        int i2 = zzei.f45956zza;
        zzfu zzfuVarZzb = zzb(zzfuVar, bArr, 0, length, zzfh.f45993zza);
        if (zzfuVarZzb == null || zzc(zzfuVarZzb, true)) {
            return zzfuVarZzb;
        }
        throw new zzia(zzfuVarZzb).zza();
    }

    public static zzfy zzu() {
        return zzfv.zzf();
    }

    public static zzfz zzv() {
        return zzhj.zze();
    }

    public static Object zzx(Method method, Object obj2, Object... objArr) {
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

    public static Object zzy(zzhb zzhbVar, String str, Object[] objArr) {
        return new zzhk(zzhbVar, str, objArr);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        return zzhi.zza().zzb(getClass()).zzj(this, (zzfu) obj2);
    }

    public final int hashCode() {
        if (zzF()) {
            return zzm();
        }
        int i = this.f45954zza;
        if (i != 0) {
            return i;
        }
        int iZzm = zzm();
        this.f45954zza = iZzm;
        return iZzm;
    }

    public final String toString() {
        return zzhd.zza(this, super.toString());
    }

    public final void zzA() {
        this.f46023zzd &= Integer.MAX_VALUE;
    }

    public final void zzC(int i) {
        this.f46023zzd = (this.f46023zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final void zzD(zzfc zzfcVar) throws IOException {
        zzhi.zza().zzb(getClass()).zzi(this, zzfd.zza(zzfcVar));
    }

    public final boolean zzF() {
        return (this.f46023zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzd(int i, Object obj2, Object obj3);

    @Override // com.google.android.gms.internal.play_billing.zzeg
    public final int zzi(zzhl zzhlVar) {
        if (zzF()) {
            int iZza = zzhlVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(d.n("serialized size must be non-negative, was ", iZza));
        }
        int i = this.f46023zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzhlVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(d.n("serialized size must be non-negative, was ", iZza2));
        }
        this.f46023zzd = (this.f46023zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final /* synthetic */ zzhb zzl() {
        return (zzfu) zzd(6, null, null);
    }

    public final int zzm() {
        return zzhi.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final int zzn() {
        if (zzF()) {
            int iZza = zza(null);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(d.n("serialized size must be non-negative, was ", iZza));
        }
        int i = this.f46023zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zza(null);
        if (iZza2 < 0) {
            throw new IllegalStateException(d.n("serialized size must be non-negative, was ", iZza2));
        }
        this.f46023zzd = (this.f46023zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final boolean zzo() {
        return zzc(this, true);
    }

    public final zzfq zzp() {
        return (zzfq) zzd(5, null, null);
    }

    public final zzfq zzq() {
        zzfq zzfqVar = (zzfq) zzd(5, null, null);
        zzfqVar.zzh(this);
        return zzfqVar;
    }

    public final zzfu zzs() {
        return (zzfu) zzd(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final /* synthetic */ zzha zzw() {
        return (zzfq) zzd(5, null, null);
    }

    public final void zzz() {
        zzhi.zza().zzb(getClass()).zzf(this);
        zzA();
    }
}
