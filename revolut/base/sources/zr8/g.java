package zr8;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f324665a = new g();

    public g() {
        super(1, Data.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Throwable;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return new Data((List) obj2, null, false, 6, null);
    }
}
