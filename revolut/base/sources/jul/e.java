package jul;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f178682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f178683b;

    public e(ImmutableSet itemsMappers) {
        Intrinsics.checkNotNullParameter(itemsMappers, "itemsMappers");
        this.f178682a = itemsMappers;
        this.f178683b = w.y0(new jsl.b(16));
    }
}
