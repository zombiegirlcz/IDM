package com.fourthline.kyc.internal;

import com.fourthline.vision.internal.qh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes23.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f26552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f26553c;

    public e(String nodeName) {
        Intrinsics.checkNotNullParameter(nodeName, "nodeName");
        this.f26551a = nodeName;
        this.f26552b = new ArrayList();
        this.f26553c = new LinkedHashMap();
    }

    public final boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return this.f26552b.add(new h(str));
    }

    public String toString() throws IOException {
        StringBuilder sb6 = new StringBuilder();
        a(sb6, "");
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return d0.F0(string).toString();
    }

    public final e a(String str, Pair[] attributes, Function1 init) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(init, "init");
        e eVar = new e(str);
        init.invoke(eVar);
        a((Pair[]) Arrays.copyOf(attributes, attributes.length));
        this.f26552b.add(eVar);
        return eVar;
    }

    public final void a(String name, Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f26553c.put(name, value.toString());
    }

    @Override // com.fourthline.kyc.internal.a
    public void a(Appendable builder, String indent) throws IOException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(indent, "indent");
        String strLineSeparator = System.lineSeparator();
        builder.append(indent + "<" + this.f26551a + a());
        if (this.f26552b.isEmpty()) {
            builder.append("/>" + strLineSeparator);
            return;
        }
        if (this.f26552b.size() == 1 && (this.f26552b.get(0) instanceof h)) {
            builder.append(">");
            Object obj2 = this.f26552b.get(0);
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.fourthline.kyc.zipper.internal.xml.TextElement");
            ((h) obj2).a(builder);
            builder.append("</" + this.f26551a + ">" + strLineSeparator);
            return;
        }
        builder.append(">" + strLineSeparator);
        Iterator it8 = this.f26552b.iterator();
        while (it8.hasNext()) {
            ((a) it8.next()).a(builder, indent + "\t");
        }
        builder.append(indent + "</" + this.f26551a + ">" + strLineSeparator);
    }

    private final String a() throws IOException {
        if (this.f26553c.isEmpty()) {
            return "";
        }
        Set setEntrySet = this.f26553c.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        return " " + zhm.d0.k0(setEntrySet, " ", null, null, 0, new qh(10), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Map.Entry it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getKey() + "=\"" + b.a(it8.getValue().toString()) + "\"";
    }

    private final void a(Pair... pairArr) {
        for (Pair pair : pairArr) {
            a((String) pair.f186385a, pair.f186386b);
        }
    }
}
