package com.revolut.feature.alipay_plus.mpm.support;

import a0.d;
import cim.b;
import hhd.n;
import java.io.IOException;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v0.a;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogFormatter;", "", "<init>", "()V", "render", "", "event", "Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogEvent;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMLogFormatter {

    @NotNull
    public static final APMPMLogFormatter INSTANCE = new APMPMLogFormatter();

    private APMPMLogFormatter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence render$lambda$1(Map.Entry it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getKey() + "=" + it8.getValue();
    }

    @NotNull
    public final String render(@NotNull APMPMLogEvent event) throws IOException {
        Intrinsics.checkNotNullParameter(event, "event");
        String strK0 = d0.k0(d0.P0(event.getMetadata().entrySet(), new Comparator() { // from class: com.revolut.feature.alipay_plus.mpm.support.APMPMLogFormatter$render$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b((String) ((Map.Entry) t2).getKey(), (String) ((Map.Entry) t3).getKey());
            }
        }), " ", null, null, 0, new n(21), 30);
        String strName = event.getLevel().name();
        String lowerCase = event.getCategory().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strU = d.u(a.m("[", strName, "] [", lowerCase, "."), event.getName(), "] ", event.getMessage());
        return kotlin.text.d0.W(strK0) ? strU : com.google.android.gms.internal.mlkit_vision_face.a.o(strU, " ", strK0);
    }
}
