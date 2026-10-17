package d8f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes8.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f112254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112255c;
    public final boolean d;

    public /* synthetic */ s(TextLocalisedClause textLocalisedClause, boolean z, boolean z3, int i) {
        this.f112253a = i;
        this.f112254b = textLocalisedClause;
        this.f112255c = z;
        this.d = z3;
    }

    public Clause a() {
        switch (this.f112253a) {
        }
        return this.f112254b;
    }
}
