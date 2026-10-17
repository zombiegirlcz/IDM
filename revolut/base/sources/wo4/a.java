package wo4;

import kotlin.jvm.internal.Intrinsics;
import vo4.a;
import wl4.b;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final b a(vo4.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        a.C1611a explainer = aVar.getExplainer();
        return new b(explainer != null ? new wl4.a(explainer.getTitle(), explainer.getDescription()) : null);
    }
}
