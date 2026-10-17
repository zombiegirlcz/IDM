package mic;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c0 extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f205654a = new c0();

    public c0() {
        super(1, zi0.c.class, "toData", "toData(Ljava/lang/Object;ZLjava/lang/Throwable;)Lcom/revolut/data/model/Data;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean bool = (Boolean) obj2;
        bool.getClass();
        return zi0.c.P(bool, false, null, 3);
    }
}
