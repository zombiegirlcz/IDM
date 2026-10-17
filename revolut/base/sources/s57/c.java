package s57;

import kotlin.Pair;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f260011a = new c();

    public c() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Boolean bool2 = (Boolean) obj3;
        bool2.booleanValue();
        return new Pair(bool, bool2);
    }
}
