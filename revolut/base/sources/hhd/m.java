package hhd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f152399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f152400c;

    public m(TextLocalisedClause doneButtonClause, String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(doneButtonClause, "doneButtonClause");
        this.f152398a = str;
        this.f152399b = tabs;
        this.f152400c = doneButtonClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f152398a, mVar.f152398a) && this.f152399b.equals(mVar.f152399b) && this.f152400c.equals(mVar.f152400c);
    }

    public final int hashCode() {
        String str = this.f152398a;
        return this.f152400c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f152399b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
