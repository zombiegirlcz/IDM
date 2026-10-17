package jqa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreenContract$InputData;
import java.util.Set;
import jm4.z3;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditCardOwnerScreenContract$InputData f177537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f177538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f177539c;

    public d(e eVar, EditCardOwnerScreenContract$InputData editCardOwnerScreenContract$InputData) {
        this.f177537a = editCardOwnerScreenContract$InputData;
        int i = 28;
        this.f177538b = e4m.b.b(new z3(eVar, this, 1, i));
        this.f177539c = e4m.b.b(new z3(eVar, this, 0, i));
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
