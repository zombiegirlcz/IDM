package com.fourthline.orca.internal;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/orca/internal/aj0;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class aj0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f26820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aj0 f26821b = new aj0("LightOnly", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aj0 f26822c = new aj0("DarkOnly", 1);
    public static final aj0 d = new aj0("LightAndDark", 2);
    private static final /* synthetic */ aj0[] e;
    private static final /* synthetic */ EnumEntries f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.aj0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) aj0.f26820a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        aj0[] aj0VarArrA = a();
        e = aj0VarArrA;
        f = vc.s.n(aj0VarArrA);
        INSTANCE = new Companion(null);
        f26820a = yhm.j.c(yhm.k.PUBLICATION, new vk1(6));
    }

    private aj0(String str, int i) {
    }

    private static final /* synthetic */ aj0[] a() {
        return new aj0[]{f26821b, f26822c, d};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.a("com.fourthline.orca.core.internal.styling.OrcaStylingStrategy", values(), new String[]{"light-only", "dark-only", "light-and-dark"}, new Annotation[][]{null, null, null});
    }

    public static aj0 valueOf(String str) {
        return (aj0) Enum.valueOf(aj0.class, str);
    }

    public static aj0[] values() {
        return (aj0[]) e.clone();
    }
}
