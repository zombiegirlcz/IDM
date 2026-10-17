package nl;

import android.content.Context;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import com.onfido.workflow.internal.ui.FaceSelfieIntroScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class v implements igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f216955b;

    public /* synthetic */ v(c0 c0Var, int i) {
        this.f216954a = i;
        this.f216955b = c0Var;
    }

    @Override // igm.a
    public final void run() {
        switch (this.f216954a) {
            case 0:
                c0 this$0 = this.f216955b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                hx7.e.f(this$0.d);
                break;
            case 1:
                c0 this$02 = this.f216955b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.d.navigateTo(SelfieCaptureScreen.INSTANCE);
                break;
            default:
                c0 this$03 = this.f216955b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Navigator navigator = this$03.d;
                Context context = this$03.f216893a;
                String string = context.getString(R.string.onfido_selfie_intro_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = context.getString(R.string.onfido_selfie_intro_subtitle);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = context.getString(R.string.onfido_selfie_intro_banner_nudity_message);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                navigator.navigateTo(new FaceSelfieIntroScreen(string, string2, string3, zhm.v.k(context.getString(R.string.onfido_selfie_intro_list_item_face_forward), context.getString(R.string.onfido_selfie_intro_list_item_no_face_cover))));
                break;
        }
    }
}
