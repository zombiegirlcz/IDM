package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items.CategoryItemsScreenContract$InputData;
import java.util.Collections;
import java.util.Set;
import jm4.c3;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategoryItemsScreenContract$InputData f193937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f193938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193939c;

    public f(l lVar, CategoryItemsScreenContract$InputData categoryItemsScreenContract$InputData) {
        this.f193938b = lVar;
        this.f193937a = categoryItemsScreenContract$InputData;
        this.f193939c = e4m.b.b(new c3(lVar, this, 29));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
