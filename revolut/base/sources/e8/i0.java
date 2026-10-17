package e8;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlm;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements CallAdapter, zzoa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f123476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f123477b;

    public /* synthetic */ i0(boolean z, zzks zzksVar) {
        this.f123476a = z;
        this.f123477b = zzksVar;
    }

    public synchronized void a(e0 e0Var, boolean z) {
        try {
            if (this.f123476a || z) {
                ((Handler) this.f123477b).obtainMessage(1, e0Var).sendToTarget();
            } else {
                this.f123476a = true;
                e0Var.recycle();
                this.f123476a = false;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call originalCall) {
        Intrinsics.checkNotNullParameter(originalCall, "call");
        if (!this.f123476a) {
            return new ik0.d(originalCall);
        }
        ik0.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(originalCall, "originalCall");
        return new ik0.d(originalCall, true);
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return (Type) this.f123477b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
    public zznr zza() {
        boolean z = this.f123476a;
        zzks zzksVar = (zzks) this.f123477b;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(z ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlm zzlmVar = new zzlm();
        zzlmVar.zzb(zzksVar);
        zzkuVar.zzh(zzlmVar.zzc());
        return zzof.zzf(zzkuVar);
    }

    public i0() {
        this.f123477b = new Handler(Looper.getMainLooper(), new h0());
    }

    public i0(Type responseType, boolean z) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        this.f123477b = responseType;
        this.f123476a = z;
    }
}
