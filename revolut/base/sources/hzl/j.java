package hzl;

import com.revolut.core.ui_kit.models.Clause;

/* JADX INFO: loaded from: classes12.dex */
public interface j extends yqi.b {
    @Override // yqi.b
    default Clause a() {
        return getDescription();
    }

    Clause getDescription();

    Clause getTitle();
}
