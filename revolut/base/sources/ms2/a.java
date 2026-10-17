package ms2;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration;
import kotlin.jvm.functions.Function0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluePromptActivity f208621b;

    public /* synthetic */ a(BluePromptActivity bluePromptActivity, int i) {
        this.f208620a = i;
        this.f208621b = bluePromptActivity;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f208620a;
        BluePromptActivity bluePromptActivity = this.f208621b;
        switch (i) {
            case 0:
                BluePromptActivity.Companion companion = BluePromptActivity.INSTANCE;
                String f64310a = ((BluePromptContract$Configuration) bluePromptActivity.G0()).getF64310a();
                return f64310a == null ? "BLUE_PROMPT_FLOW" : f64310a;
            case 1:
                BluePromptActivity.Companion companion2 = BluePromptActivity.INSTANCE;
                return new z4l.j(7, v.k(new PlainTextDelegate(), (LargeActionButtonDelegate) bluePromptActivity.f64292w0.getValue(), (ListCellBulletDelegate) bluePromptActivity.f64293x0.getValue(), (TwinHorizontalButtonDelegate) bluePromptActivity.y0.getValue(), (InputChecklistDelegate) bluePromptActivity.z0.getValue()), false);
            default:
                BluePromptActivity.Companion companion3 = BluePromptActivity.INSTANCE;
                koi.c cVar = new koi.c(0);
                cVar.a(bluePromptActivity.b1());
                cVar.a(bluePromptActivity.u0);
                return new z4l.j(cVar, false, 14);
        }
    }
}
