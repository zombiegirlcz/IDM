package z58;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_dob.EditBirthDateControllerContract$InputData;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditBirthDateControllerContract$InputData f319567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f319568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f319569c;

    public h(j jVar, EditBirthDateControllerContract$InputData editBirthDateControllerContract$InputData) {
        this.f319567a = editBirthDateControllerContract$InputData;
        int i = 11;
        this.f319568b = e4m.b.b(new k0(jVar, this, 1, i));
        this.f319569c = e4m.b.b(new k0(jVar, this, 0, i));
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
