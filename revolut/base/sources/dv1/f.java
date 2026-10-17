package dv1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import yhm.j;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements yu1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.c f118020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f118021b;

    public f(zzl.c regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f118020a = regexMatcher;
        this.f118021b = j.b(new d8e.a(this, 16));
    }

    public final av1.c a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        for (Pair pair : (List) this.f118021b.getValue()) {
            String str = (String) pair.f186385a;
            KFunction kFunction = (KFunction) pair.f186386b;
            if (this.f118020a.a(str, input)) {
                ApmDescriptor apmDescriptor = (ApmDescriptor) ((Function1) kFunction).invoke(input);
                Intrinsics.checkNotNullParameter(apmDescriptor, "<this>");
                return new av1.a(apmDescriptor);
            }
        }
        return new av1.b(input);
    }
}
