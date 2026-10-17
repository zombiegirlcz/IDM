package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.c, ct9.a, gt9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupChatFlowContract$InputData f188676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f188677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f188678c = this;
    public final e4m.e d;
    public final e4m.e e;

    public a(l lVar, GroupChatFlowContract$InputData groupChatFlowContract$InputData) {
        this.f188677b = lVar;
        this.f188676a = groupChatFlowContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new jqa.h(lVar, this, 0, i));
        this.e = e4m.b.b(new jqa.h(lVar, this, 1, i));
    }

    @Override // ct9.a
    public final o b() {
        return new o(this.f188677b, this.f188678c, 1);
    }

    @Override // gt9.a
    public final q c() {
        return new q(this.f188677b, this.f188678c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
