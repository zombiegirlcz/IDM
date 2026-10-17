package m08;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.insurance_pet.impl.ui.profile.help.PetGetHelpActivity;
import kotlin.jvm.functions.Function0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PetGetHelpActivity f201095b;

    public /* synthetic */ a(PetGetHelpActivity petGetHelpActivity, int i) {
        this.f201094a = i;
        this.f201095b = petGetHelpActivity;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f201094a;
        PetGetHelpActivity petGetHelpActivity = this.f201095b;
        switch (i) {
            case 0:
                int i2 = PetGetHelpActivity.f76392x0;
                return v.k((TwinHorizontalButtonDelegate) petGetHelpActivity.f76395v0.getValue(), (RowDelegate) petGetHelpActivity.u0.getValue());
            default:
                int i3 = PetGetHelpActivity.f76392x0;
                return new z4l.j(7, v.k(new CounterTextDelegate(), (RowDelegate) petGetHelpActivity.u0.getValue()), false);
        }
    }
}
