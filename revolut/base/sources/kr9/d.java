package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_chat.trusted.GroupChatTrustedScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupChatTrustedScreenContract$InputData f188713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f188714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f188715c;

    public d(l lVar, g gVar, GroupChatTrustedScreenContract$InputData groupChatTrustedScreenContract$InputData) {
        this.f188713a = groupChatTrustedScreenContract$InputData;
        int i = 27;
        this.f188714b = e4m.b.b(new jqa.h(lVar, this, 1, i));
        this.f188715c = e4m.b.b(new jqa.h(lVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
