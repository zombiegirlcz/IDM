package androidx.content;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u001f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Landroidx/navigation/NavType;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "navTypeParseAndPut", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "type", "navTypeFromArgType", "(Ljava/lang/String;)Landroidx/navigation/NavType;", "", "navTypeInferFromValue", "navTypeInferFromValueType", "(Ljava/lang/Object;)Landroidx/navigation/NavType;", "navigation-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class NavTypeKt {
    public static final NavType<?> navTypeFromArgType(String str) {
        NavType<Integer> navType = NavType.IntType;
        if (Intrinsics.f(navType.getName(), str)) {
            return navType;
        }
        NavType navType2 = NavType.IntArrayType;
        if (Intrinsics.f(navType2.getName(), str)) {
            return navType2;
        }
        NavType<List<Integer>> navType3 = NavType.IntListType;
        if (Intrinsics.f(navType3.getName(), str)) {
            return navType3;
        }
        NavType<Long> navType4 = NavType.LongType;
        if (Intrinsics.f(navType4.getName(), str)) {
            return navType4;
        }
        NavType navType5 = NavType.LongArrayType;
        if (Intrinsics.f(navType5.getName(), str)) {
            return navType5;
        }
        NavType<List<Long>> navType6 = NavType.LongListType;
        if (Intrinsics.f(navType6.getName(), str)) {
            return navType6;
        }
        NavType<Boolean> navType7 = NavType.BoolType;
        if (Intrinsics.f(navType7.getName(), str)) {
            return navType7;
        }
        NavType navType8 = NavType.BoolArrayType;
        if (Intrinsics.f(navType8.getName(), str)) {
            return navType8;
        }
        NavType<List<Boolean>> navType9 = NavType.BoolListType;
        if (Intrinsics.f(navType9.getName(), str)) {
            return navType9;
        }
        NavType<String> navType10 = NavType.StringType;
        if (Intrinsics.f(navType10.getName(), str)) {
            return navType10;
        }
        NavType navType11 = NavType.StringArrayType;
        if (Intrinsics.f(navType11.getName(), str)) {
            return navType11;
        }
        NavType<List<String>> navType12 = NavType.StringListType;
        if (Intrinsics.f(navType12.getName(), str)) {
            return navType12;
        }
        NavType<Float> navType13 = NavType.FloatType;
        if (Intrinsics.f(navType13.getName(), str)) {
            return navType13;
        }
        NavType navType14 = NavType.FloatArrayType;
        if (Intrinsics.f(navType14.getName(), str)) {
            return navType14;
        }
        NavType<List<Float>> navType15 = NavType.FloatListType;
        if (Intrinsics.f(navType15.getName(), str)) {
            return navType15;
        }
        return null;
    }

    @NotNull
    public static final NavType<Object> navTypeInferFromValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            try {
                try {
                    try {
                        NavType<Integer> navType = NavType.IntType;
                        navType.parseValue(value);
                        Intrinsics.i(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType;
                    } catch (IllegalArgumentException unused) {
                        NavType<Long> navType2 = NavType.LongType;
                        navType2.parseValue(value);
                        Intrinsics.i(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType2;
                    }
                } catch (IllegalArgumentException unused2) {
                    NavType<Boolean> navType3 = NavType.BoolType;
                    navType3.parseValue(value);
                    Intrinsics.i(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType3;
                }
            } catch (IllegalArgumentException unused3) {
                NavType<Float> navType4 = NavType.FloatType;
                navType4.parseValue(value);
                Intrinsics.i(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
        } catch (IllegalArgumentException unused4) {
            NavType<String> navType5 = NavType.StringType;
            Intrinsics.i(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
    }

    public static final NavType<Object> navTypeInferFromValueType(Object obj2) {
        if (obj2 instanceof Integer) {
            NavType<Integer> navType = NavType.IntType;
            Intrinsics.i(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType;
        }
        if (obj2 instanceof int[]) {
            NavType<int[]> navType2 = NavType.IntArrayType;
            Intrinsics.i(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType2;
        }
        if (obj2 instanceof Long) {
            NavType<Long> navType3 = NavType.LongType;
            Intrinsics.i(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType3;
        }
        if (obj2 instanceof long[]) {
            NavType<long[]> navType4 = NavType.LongArrayType;
            Intrinsics.i(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType4;
        }
        if (obj2 instanceof Float) {
            NavType<Float> navType5 = NavType.FloatType;
            Intrinsics.i(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
        if (obj2 instanceof float[]) {
            NavType<float[]> navType6 = NavType.FloatArrayType;
            Intrinsics.i(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType6;
        }
        if (obj2 instanceof Boolean) {
            NavType<Boolean> navType7 = NavType.BoolType;
            Intrinsics.i(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType7;
        }
        if (obj2 instanceof boolean[]) {
            NavType<boolean[]> navType8 = NavType.BoolArrayType;
            Intrinsics.i(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType8;
        }
        if (!(obj2 instanceof String) && obj2 != null) {
            return null;
        }
        NavType<String> navType9 = NavType.StringType;
        Intrinsics.i(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
        return navType9;
    }

    public static final <T> T navTypeParseAndPut(@NotNull NavType<T> navType, @NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(navType, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        T value2 = navType.parseValue(value);
        navType.put(bundle, key, value2);
        return value2;
    }

    public static final <T> T navTypeParseAndPut(@NotNull NavType<T> navType, @NotNull Bundle bundle, @NotNull String key, String str, T t2) {
        Intrinsics.checkNotNullParameter(navType, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!SavedStateReader.m3591containsimpl(SavedStateReader.m3590constructorimpl(bundle), key)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str == null) {
            return t2;
        }
        T value = navType.parseValue(str, t2);
        navType.put(bundle, key, value);
        return value;
    }
}
