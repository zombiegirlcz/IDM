package aj5;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zi5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5399a;

    public a(b defaultAddressParser, ImmutableMap parsers) {
        Intrinsics.checkNotNullParameter(defaultAddressParser, "defaultAddressParser");
        Intrinsics.checkNotNullParameter(parsers, "parsers");
        this.f5399a = parsers;
    }
}
