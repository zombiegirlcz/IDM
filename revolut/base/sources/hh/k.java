package hh;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvj;

/* JADX INFO: loaded from: classes17.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractSafeParcelable f152212b;

    public /* synthetic */ k(AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.f152211a = i;
        this.f152212b = abstractSafeParcelable;
    }

    public final String a() {
        switch (this.f152211a) {
            case 0:
                return ((zzvj) this.f152212b).zzm();
            default:
                return ((zzu) this.f152212b).f42463zzb;
        }
    }

    public final int b() {
        switch (this.f152211a) {
            case 0:
                return ((zzvj) this.f152212b).zzb();
            default:
                return ((zzu) this.f152212b).f42465zzd;
        }
    }
}
