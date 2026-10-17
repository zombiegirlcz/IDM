package dmb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.vaults.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f115882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f115884c;

    public j(TextLocalisedClause text, boolean z, LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f115882a = text;
        this.f115883b = z;
        this.f115884c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f115882a, jVar.f115882a) && this.f115883b == jVar.f115883b && Intrinsics.f(this.f115884c, jVar.f115884c);
    }

    public final int hashCode() {
        return this.f115884c.hashCode() + j6.a.c(this.f115882a.hashCode() * 31, 31, this.f115883b);
    }

    public j() {
        this(new TextLocalisedClause(R$string.vaults_common_action_continue, null, null, 14), true, LargeActionButton.ButtonStyle.f58725a);
    }
}
