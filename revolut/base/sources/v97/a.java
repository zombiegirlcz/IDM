package v97;

import com.revolut.core.ui_kit.models.Clause;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements f01.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f286982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f286983b;

    public a(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f286982a = uiKitResources;
        this.f286983b = new ConcurrentHashMap();
    }

    @Override // f01.a
    public final int a(String resKey) {
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        return this.f286982a.a(resKey);
    }

    @Override // f01.a
    public final CharSequence b(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Pair pair = new Pair(clause, null);
        ConcurrentHashMap concurrentHashMap = this.f286983b;
        Object objB = concurrentHashMap.get(pair);
        if (objB == null) {
            objB = this.f286982a.b(clause);
            concurrentHashMap.putIfAbsent(pair, objB);
        }
        return (CharSequence) objB;
    }
}
