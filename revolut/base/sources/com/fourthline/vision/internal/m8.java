package com.fourthline.vision.internal;

import java.io.File;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface m8 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36562a = new a("VIDEO", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f36563b = new a("AUDIO", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f36564c;
        private static final /* synthetic */ EnumEntries d;

        private static final /* synthetic */ a[] $values() {
            return new a[]{f36562a, f36563b};
        }

        static {
            a[] aVarArr$values = $values();
            f36564c = aVarArr$values;
            d = vc.s.n(aVarArr$values);
        }

        private a(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return d;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36564c.clone();
        }
    }

    @NotNull
    File createResultFile(@NotNull a aVar);

    @NotNull
    File createTempFile(@NotNull a aVar);

    void deleteTempFiles();
}
