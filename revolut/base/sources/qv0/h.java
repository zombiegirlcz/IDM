package qv0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public abstract class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h EXTRA_LARGE;
    public static final h LARGE;
    public static final h MEDIUM;
    public static final h SMALL;

    static {
        h hVar = new h() { // from class: qv0.g

            /* JADX INFO: renamed from: dp, reason: collision with root package name */
            private final float f249519dp = 4.0f;

            @Override // qv0.h
            public final float a() {
                return this.f249519dp;
            }
        };
        SMALL = hVar;
        h hVar2 = new h() { // from class: qv0.f

            /* JADX INFO: renamed from: dp, reason: collision with root package name */
            private final float f249518dp = 8.0f;

            @Override // qv0.h
            public final float a() {
                return this.f249518dp;
            }
        };
        MEDIUM = hVar2;
        h hVar3 = new h() { // from class: qv0.e
            @Override // qv0.h
            public final float a() {
                return 20.0f;
            }
        };
        LARGE = hVar3;
        h hVar4 = new h() { // from class: qv0.d
            @Override // qv0.h
            public final float a() {
                return 24.0f;
            }
        };
        EXTRA_LARGE = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public abstract float a();
}
