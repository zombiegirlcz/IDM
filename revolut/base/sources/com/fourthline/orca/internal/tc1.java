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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/orca/internal/tc1;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class tc1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f33275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tc1 f33276b = new tc1("None", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f33277c = new tc1("NotRequired", 1);
    public static final tc1 d = new tc1("Uploaded", 2);
    private static final /* synthetic */ tc1[] e;
    private static final /* synthetic */ EnumEntries f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tc1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) tc1.f33275a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        tc1[] tc1VarArrA = a();
        e = tc1VarArrA;
        f = vc.s.n(tc1VarArrA);
        INSTANCE = new Companion(null);
        f33275a = yhm.j.c(yhm.k.PUBLICATION, new nr1(14));
    }

    private tc1(String str, int i) {
    }

    private static final /* synthetic */ tc1[] a() {
        return new tc1[]{f33276b, f33277c, d};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.b("com.fourthline.orca.core.internal.backend.model.UploadStatus", values());
    }

    public static tc1 valueOf(String str) {
        return (tc1) Enum.valueOf(tc1.class, str);
    }

    public static tc1[] values() {
        return (tc1[]) e.clone();
    }
}
