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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/orca/internal/v6;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class v6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f34253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v6 f34254b = new v6("Online", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v6 f34255c = new v6("Sepa", 1);
    public static final v6 d = new v6("Manual", 2);
    private static final /* synthetic */ v6[] e;
    private static final /* synthetic */ EnumEntries f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v6$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) v6.f34253a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        v6[] v6VarArrA = a();
        e = v6VarArrA;
        f = vc.s.n(v6VarArrA);
        INSTANCE = new Companion(null);
        f34253a = yhm.j.c(yhm.k.PUBLICATION, new nr1(25));
    }

    private v6(String str, int i) {
    }

    private static final /* synthetic */ v6[] a() {
        return new v6[]{f34254b, f34255c, d};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.b("com.fourthline.orca.bav.internal.model.BavType", values());
    }

    public static v6 valueOf(String str) {
        return (v6) Enum.valueOf(v6.class, str);
    }

    public static v6[] values() {
        return (v6[]) e.clone();
    }
}
