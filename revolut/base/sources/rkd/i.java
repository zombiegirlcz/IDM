package rkd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotManagerPromptControllerContract$InputData f254822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f254823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f254824c;
    public final e4m.e d;

    public i(g gVar, SlotManagerPromptControllerContract$InputData slotManagerPromptControllerContract$InputData) {
        this.f254823b = gVar;
        this.f254822a = slotManagerPromptControllerContract$InputData;
        int i = 10;
        this.f254824c = e4m.b.b(new r7d.o(gVar, this, 1, i));
        this.d = e4m.b.b(new r7d.o(gVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
