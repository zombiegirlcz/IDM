package h30;

import com.google.common.collect.ImmutableSet;
import com.revolut.chat.ui.flow.ChatFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends d50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatFlowContract$InputData f148935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f148936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f148937c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public o(n nVar, ViewController viewController, ChatFlowContract$InputData chatFlowContract$InputData) {
        this.f148936b = nVar;
        this.f148935a = chatFlowContract$InputData;
        this.d = e4m.b.b(new h08.e(nVar, this, 0, 7));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new h08.e(nVar, this, 1, 7));
    }

    @Override // d50.a
    public final q A() {
        return new q(this.f148936b, this.f148937c, 0);
    }

    @Override // d50.a
    public final a50.c B() {
        return (a50.c) this.d.get();
    }

    @Override // d50.a
    public final q D() {
        return new q(this.f148936b, this.f148937c, 1);
    }

    @Override // q40.b
    public final q40.a b() {
        return new y(this.f148936b, this.f148937c);
    }

    @Override // c50.a
    public final b0 c() {
        return new b0();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // f50.a
    public final f50.d j() {
        return new d0(this.f148936b, this.f148937c);
    }

    @Override // i40.a
    public final w q() {
        return new w(this.f148936b, this.f148937c);
    }

    @Override // d50.a
    public final twg.c s() {
        twg.c cVar = new twg.c();
        cVar.f275017a = this.f148936b;
        cVar.f275018b = this.f148937c;
        return cVar;
    }

    @Override // d50.a
    public final a61.a y() {
        return new a61.a(this.f148936b, this.f148937c);
    }
}
