package u8d;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseContract$InputData;
import com.revolut.kompot.navigable.TransitionAnimation;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e8d.a f278174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k18.c f278175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FaqSomethingElseContract$InputData f278176r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, e8d.a chatButtonItemProvider, k18.c faqProvider, FaqSomethingElseContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(chatButtonItemProvider, "chatButtonItemProvider");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f278174p = chatButtonItemProvider;
        this.f278175q = faqProvider;
        this.f278176r = inputData;
    }

    @Override // jki.g
    public final jki.i r2() {
        return new a(this.f278176r.f86299b);
    }

    public final void y2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Continuation continuation = null;
        if (Intrinsics.f(itemId, "SEARCH_ITEM_ID")) {
            SharedFaqDestination.StartPoint.Search search = new SharedFaqDestination.StartPoint.Search(this.f278176r.f86298a);
            TransitionAnimation.FADE fade = TransitionAnimation.FADE.f98392a;
            C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) search, (SharedFaqDestination.PassthroughData) null, false, 10));
        } else {
            this.f278174p.getClass();
            if (Intrinsics.f(itemId, "CHAT_BUTTON_ITEM_ID")) {
                n2(new u83.f(this, continuation, 2), new whi.b(6));
            }
        }
    }
}
