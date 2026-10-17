package mu9;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.payments.messaging.common.impl.reactions.EmojiBottomSheetController;
import com.revolut.feature.payments.messaging.common.impl.reactions.ReactionsAuthorsBottomSheetController;
import fu9.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof c) {
            return ((c) descriptor).a(new EmojiBottomSheetController());
        }
        if (!(descriptor instanceof fu9.e)) {
            return null;
        }
        fu9.e eVar = (fu9.e) descriptor;
        return eVar.a(new ReactionsAuthorsBottomSheetController(eVar.f138152a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
