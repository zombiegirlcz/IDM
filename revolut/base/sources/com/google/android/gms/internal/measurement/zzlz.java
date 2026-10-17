package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmd;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public class zzlz<MessageType extends zzmd<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> extends zzkn<MessageType, BuilderType> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected zzmd f40454zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzmd f40455zzb;

    public zzlz(MessageType messagetype) {
        this.f40455zzb = messagetype;
        if (messagetype.zzcw()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f40454zza = messagetype.zzcj();
    }

    private static void zza(Object obj2, Object obj3) {
        zznp.zza().zzb(obj2.getClass()).zzg(obj2, obj3);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ zzkn zzaS(byte[] bArr, int i, int i2) throws zzmm {
        int i3 = zzlp.f40429zzb;
        int i5 = zznp.f40513zza;
        zzaZ(bArr, 0, i2, zzlp.f40428zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ zzkn zzaT(byte[] bArr, int i, int i2, zzlp zzlpVar) throws zzmm {
        zzaZ(bArr, 0, i2, zzlpVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    /* JADX INFO: renamed from: zzaX, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzlz zzaR() {
        zzlz zzlzVar = (zzlz) this.f40455zzb.zzl(5, null, null);
        zzlzVar.f40454zza = zzbc();
        return zzlzVar;
    }

    public final zzlz zzaY(zzmd zzmdVar) {
        if (!this.f40455zzb.equals(zzmdVar)) {
            if (!this.f40454zza.zzcw()) {
                zzbf();
            }
            zza(this.f40454zza, zzmdVar);
        }
        return this;
    }

    public final zzlz zzaZ(byte[] bArr, int i, int i2, zzlp zzlpVar) throws zzmm {
        if (!this.f40454zza.zzcw()) {
            zzbf();
        }
        try {
            zznp.zza().zzb(this.f40454zza.getClass()).zzh(this.f40454zza, bArr, 0, i2, new zzks(zzlpVar));
            return this;
        } catch (zzmm e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final MessageType zzba() {
        MessageType messagetype = (MessageType) zzbc();
        if (messagetype.zzcD()) {
            return messagetype;
        }
        throw new zzod(messagetype);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    /* JADX INFO: renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public MessageType zzbc() {
        if (!this.f40454zza.zzcw()) {
            return (MessageType) this.f40454zza;
        }
        this.f40454zza.zzcr();
        return (MessageType) this.f40454zza;
    }

    public final void zzbe() {
        if (this.f40454zza.zzcw()) {
            return;
        }
        zzbf();
    }

    public void zzbf() {
        zzmd zzmdVarZzcj = this.f40455zzb.zzcj();
        zza(zzmdVarZzcj, this.f40454zza);
        this.f40454zza = zzmdVarZzcj;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final /* bridge */ /* synthetic */ zznh zzcC() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zzcD() {
        return zzmd.zzd(this.f40454zza, false);
    }
}
