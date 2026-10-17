package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import java.net.URI;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface o8 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36623a = new a("NONE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f36624b = new a("VIDEO", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f36625c = new a("VIDEO_AUDIO", 2);
        private static final /* synthetic */ a[] d;
        private static final /* synthetic */ EnumEntries e;

        private static final /* synthetic */ a[] $values() {
            return new a[]{f36623a, f36624b, f36625c};
        }

        static {
            a[] aVarArr$values = $values();
            d = aVarArr$values;
            e = vc.s.n(aVarArr$values);
        }

        private a(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return e;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    Object cancel(@NotNull Continuation<? super Unit> continuation);

    z getVideoRecorder();

    void setVideoRecorder(z zVar);

    @NotNull
    Try<Unit> start();

    Object stop(@NotNull Continuation<? super Try<URI>> continuation);
}
