package com.fourthline.orca;

import ib.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/fourthline/orca/Orca;", "", "<init>", "()V", "a", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Orca {
    public static final int $stable = 0;

    @NotNull
    public static final Orca INSTANCE = new Orca();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f26561b = new a("Workflow", 0, b.Workflow);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f26562c = new a("Components", 1, "components");
        private static final /* synthetic */ a[] d;
        private static final /* synthetic */ EnumEntries e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26563a;

        static {
            a[] aVarArrA = a();
            d = aVarArrA;
            e = s.n(aVarArrA);
        }

        private a(String str, int i, String str2) {
            this.f26563a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f26561b, f26562c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }

        public final String b() {
            return this.f26563a;
        }
    }

    private Orca() {
    }
}
