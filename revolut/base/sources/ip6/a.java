package ip6;

import ep6.b;
import ep6.n;
import ip0.sr;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements zo6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp6.a f167664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f167665b;

    public a(dp6.a feedbackRepository, b feedbackBottomDialogItemsProvider) {
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        Intrinsics.checkNotNullParameter(feedbackBottomDialogItemsProvider, "feedbackBottomDialogItemsProvider");
        this.f167664a = feedbackRepository;
        this.f167665b = feedbackBottomDialogItemsProvider;
    }

    @Override // zo6.a
    public final n a(j60.a bottomExpandableDialogControllerExtension, g1 shotDialogDisplayer, sr inputStyle) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(inputStyle, "inputStyle");
        return new mp6.n(bottomExpandableDialogControllerExtension, this.f167664a, this.f167665b, shotDialogDisplayer, inputStyle);
    }
}
