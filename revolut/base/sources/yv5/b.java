package yv5;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f317121a = new b();

    public b() {
        super(1, Data.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Throwable;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return new Data((List) obj2, null, false, 6, null);
    }
}
