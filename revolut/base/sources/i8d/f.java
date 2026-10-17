package i8d;

import ip0.sr;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import rp0.g1;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements zo6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159511a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo6.a f159512b;

    public f(n widgetsInteractor, hg0.b faqInteractor, ep6.b feedbackBottomDialogItemsProvider, zo6.a newFeedbackExtensionFactory) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(faqInteractor, "faqInteractor");
        Intrinsics.checkNotNullParameter(feedbackBottomDialogItemsProvider, "feedbackBottomDialogItemsProvider");
        Intrinsics.checkNotNullParameter(newFeedbackExtensionFactory, "newFeedbackExtensionFactory");
        this.f159512b = newFeedbackExtensionFactory;
    }

    @Override // zo6.a
    public final ep6.n a(j60.a bottomExpandableDialogControllerExtension, g1 shotDialogDisplayer, sr inputStyle) {
        switch (this.f159511a) {
            case 0:
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                Intrinsics.checkNotNullParameter(inputStyle, "inputStyle");
                break;
            default:
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                Intrinsics.checkNotNullParameter(inputStyle, "inputStyle");
                break;
        }
        return this.f159512b.a(bottomExpandableDialogControllerExtension, shotDialogDisplayer, inputStyle);
    }

    public f(zo6.a aVar) {
        this.f159512b = aVar;
    }
}
