package n85;

import kotlin.Pair;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f213215a = new j();

    public j() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        return new Pair((h) obj2, new Integer(((Number) obj3).intValue()));
    }
}
