package tv0;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f274670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f274671c;

    public /* synthetic */ f(FrameLayout frameLayout, int i, int i2) {
        this.f274669a = i2;
        this.f274670b = frameLayout;
        this.f274671c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f274669a;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                this.f274670b.setTranslationY(this.f274671c - iIntValue);
                break;
            default:
                this.f274670b.setTranslationY(this.f274671c - iIntValue);
                break;
        }
        return Unit.f186387a;
    }
}
