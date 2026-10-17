package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes20.dex */
public abstract class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f210047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f210049c;
    public final int d;

    public /* synthetic */ v5(int i, int i2, TextLocalisedClause textLocalisedClause) {
        this(textLocalisedClause, i, i2, 8388659);
    }

    public int a() {
        return this.f210048b;
    }

    public v5(Clause clause, int i, int i2, int i3) {
        this.f210047a = clause;
        this.f210048b = i;
        this.f210049c = i2;
        this.d = i3;
    }
}
