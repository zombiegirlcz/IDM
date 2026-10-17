package com.fourthline.orca.internal;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/orca/internal/w5;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class w5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f34517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w5 f34518b = new w5("PROCESSING", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w5 f34519c = new w5("ERROR", 1);
    public static final w5 d = new w5("COMPLETED", 2);
    private static final /* synthetic */ w5[] e;
    private static final /* synthetic */ EnumEntries f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.w5$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) w5.f34517a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        w5[] w5VarArrA = a();
        e = w5VarArrA;
        f = vc.s.n(w5VarArrA);
        INSTANCE = new Companion(null);
        f34517a = yhm.j.c(yhm.k.PUBLICATION, new nr1(26));
    }

    private w5(String str, int i) {
    }

    private static final /* synthetic */ w5[] a() {
        return new w5[]{f34518b, f34519c, d};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.b("com.fourthline.orca.core.internal.backend.model.BavPaymentTransferStatus", values());
    }

    public static w5 valueOf(String str) {
        return (w5) Enum.valueOf(w5.class, str);
    }

    public static w5[] values() {
        return (w5[]) e.clone();
    }
}
