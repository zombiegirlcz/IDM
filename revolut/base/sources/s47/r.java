package s47;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f259798a = new r();

    public r() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        return new Pair((Data) obj2, (Data) obj3);
    }
}
