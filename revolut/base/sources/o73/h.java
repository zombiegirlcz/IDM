package o73;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.api.navigation.descriptors.NamelessCardDialogDescriptor$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NamelessCardDialogDescriptor$InputData f222692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f222693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f222694c;

    public h(e eVar, NamelessCardDialogDescriptor$InputData namelessCardDialogDescriptor$InputData) {
        this.f222692a = namelessCardDialogDescriptor$InputData;
        int i = 7;
        this.f222693b = e4m.b.b(new o41.b(eVar, this, 1, i));
        this.f222694c = e4m.b.b(new o41.b(eVar, this, 0, i));
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
