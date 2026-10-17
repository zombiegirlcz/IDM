package com.fourthline.orca.internal;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class eh0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28134b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28135a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final eh0 a(AssetManager from) throws IOException {
            Intrinsics.checkNotNullParameter(from, "from");
            try {
                InputStream inputStreamOpen = from.open("orca_configuration.json");
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
                try {
                    String strS = jh.d.s(bufferedReader);
                    bufferedReader.close();
                    return new eh0(new JSONObject(strS).getBoolean("skipPersonalDetails"));
                } finally {
                }
            } catch (FileNotFoundException unused) {
                return new eh0(false, 1, null);
            }
        }

        private a() {
        }
    }

    public eh0(boolean z) {
        this.f28135a = z;
    }

    public final boolean a() {
        return this.f28135a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof eh0) && this.f28135a == ((eh0) obj2).f28135a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f28135a);
    }

    public String toString() {
        return "OrcaConfiguration(skipPersonalDetails=" + this.f28135a + ")";
    }

    public /* synthetic */ eh0(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
