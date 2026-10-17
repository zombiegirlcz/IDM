package tim;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends tim.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f271587c = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // tim.a
    public final Random h() {
        Object obj2 = this.f271587c.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (Random) obj2;
    }
}
