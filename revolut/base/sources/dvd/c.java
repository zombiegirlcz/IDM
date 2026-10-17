package dvd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f118082b = v.k(10, 25, 50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zwd.b f118083a;

    public c(zwd.b amountErrorMapperProvider) {
        Intrinsics.checkNotNullParameter(amountErrorMapperProvider, "amountErrorMapperProvider");
        this.f118083a = amountErrorMapperProvider;
    }
}
