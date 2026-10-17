package vs9;

import com.revolut.feature.payments.groups.impl.ui_chat.trusted.GroupChatTrustedScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mq9.f f291757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f291758q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(GroupChatTrustedScreenContract$InputData inputData, p stateMapper, mq9.f groupsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        this.f291757p = groupsInteractor;
        this.f291758q = new d(inputData.f79395a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f291758q;
    }
}
