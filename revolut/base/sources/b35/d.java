package b35;

import a83.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d implements mf1.a {
    public static j0 d(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return new j0(new a35.d(flow, 27), 7);
    }

    @Override // mf1.a
    public final String b() {
        return null;
    }

    public abstract fs3.b c();
}
