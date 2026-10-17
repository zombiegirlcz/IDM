package f28;

import com.revolut.data.model.Data;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f131478a = new p();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data it8 = (Data) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return (Optional) it8.getContent();
    }
}
