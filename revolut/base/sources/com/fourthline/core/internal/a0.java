package com.fourthline.core.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class a0 extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26291b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26292a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f26293b = "platform";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f26294c = "sdk_version";
        private static final String d = "origin";

        private a() {
        }

        public final String a() {
            return d;
        }

        public final String b() {
            return f26293b;
        }

        public final String c() {
            return f26294c;
        }
    }

    public a0() {
        super(ib.b.Session);
        this.f26290a = ib.b.Session;
        this.f26291b = "iglu:com.fourthline.sdk/session/jsonschema/1-0-0";
        a aVar = a.f26292a;
        set(aVar.b(), "Android");
        set(aVar.c(), "3.4.29");
    }

    @Override // ib.b
    public String getIdentifier() {
        return this.f26290a;
    }

    @Override // ib.b
    public String getSchema() {
        return this.f26291b;
    }
}
