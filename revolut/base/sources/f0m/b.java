package f0m;

import es.e;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f131129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f131130b;

    public b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("A", "AⒶＡÀÁÂẦẤẪẨÃĀĂẰẮẴẲȦǠÄǞẢÅǺǍȀȂẠẬẶḀĄȺⱯΑ");
        linkedHashMap.put("AA", "Ꜳ");
        linkedHashMap.put("AE", "ÆǼǢ");
        linkedHashMap.put("AO", "Ꜵ");
        linkedHashMap.put("AU", "Ꜷ");
        linkedHashMap.put("AV", "ꜸꜺ");
        linkedHashMap.put("AY", "Ꜽ");
        linkedHashMap.put("B", "BⒷＢḂḄḆɃƂƁ");
        linkedHashMap.put("C", "CⒸＣĆĈĊČÇḈƇȻꜾ");
        linkedHashMap.put("CH", "Χ");
        linkedHashMap.put("D", "DⒹＤḊĎḌḐḒḎĐƋƊƉꝹΔ");
        linkedHashMap.put("DZ", "ǱǄ");
        linkedHashMap.put("Dz", "ǲǅ");
        linkedHashMap.put("E", "EⒺＥÈÉÊỀẾỄỂẼĒḔḖĔĖËẺĚȄȆẸỆȨḜĘḘḚƐƎΕ");
        linkedHashMap.put("F", "FⒻＦḞƑꝻΦ");
        linkedHashMap.put("G", "GⒼＧǴĜḠĞĠǦĢǤƓꞠꝽꝾΓ");
        linkedHashMap.put("H", "HⒽＨĤḢḦȞḤḨḪĦⱧⱵꞍ");
        linkedHashMap.put("I", "IⒾＩÌÍÎĨĪĬİÏḮỈǏȈȊỊĮḬƗΙ");
        linkedHashMap.put("J", "JⒿＪĴɈ");
        linkedHashMap.put("K", "KⓀＫḰǨḲĶḴƘⱩꝀꝂꝄꞢΚ");
        linkedHashMap.put("L", "LⓁＬĿĹĽḶḸĻḼḺŁȽⱢⱠꝈꝆꞀΛ");
        linkedHashMap.put("LJ", "Ǉ");
        linkedHashMap.put("Lj", "ǈ");
        linkedHashMap.put("M", "MⓂＭḾṀṂⱮƜΜ");
        linkedHashMap.put("N", "NⓃＮǸŃÑṄŇṆŅṊṈȠƝꞐꞤΝ");
        linkedHashMap.put("NJ", "Ǌ");
        linkedHashMap.put("Nj", "ǋ");
        linkedHashMap.put("O", "OⓄＯÒÓÔỒỐỖỔÕṌȬṎŌṐṒŎȮȰÖȪỎŐǑȌȎƠỜỚỠỞỢỌỘǪǬØǾƆƟꝊꝌΟ");
        linkedHashMap.put("OI", "Ƣ");
        linkedHashMap.put("OO", "Ꝏ");
        linkedHashMap.put("OU", "Ȣ");
        linkedHashMap.put("P", "PⓅＰṔṖƤⱣꝐꝒꝔΠ");
        linkedHashMap.put("PS", "Ψ");
        linkedHashMap.put("Q", "QⓆＱꝖꝘɊ");
        linkedHashMap.put("R", "RⓇＲŔṘŘȐȒṚṜŖṞɌⱤꝚꞦꞂΡ");
        linkedHashMap.put("S", "SⓈＳŚṤŜṠŠṦṢṨȘŞⱾꞨꞄΣ");
        linkedHashMap.put("SS", "ẞ");
        linkedHashMap.put("T", "TⓉＴṪŤṬȚŢṰṮŦƬƮȾꞆΤ");
        linkedHashMap.put("Th", "ÞΘ");
        linkedHashMap.put("TZ", "Ꜩ");
        linkedHashMap.put("U", "UⓊＵÙÚÛŨṸŪṺŬÜǛǗǕǙỦŮŰǓȔȖƯỪỨỮỬỰỤṲŲṶṴɄ");
        linkedHashMap.put("V", "VⓋＶṼṾƲꝞɅΒ");
        linkedHashMap.put("VY", "Ꝡ");
        linkedHashMap.put("W", "WⓌＷẀẂŴẆẄẈⱲ");
        linkedHashMap.put("X", "XⓍＸẊẌΞ");
        linkedHashMap.put("Y", "YⓎＹỲÝŶỸȲẎŸỶỴƳɎỾΥ");
        linkedHashMap.put("Z", "ZⓏＺŹẐŻŽẒẔƵȤⱿⱫꝢΖ");
        linkedHashMap.put("a", "aⓐａẚàáâầấẫẩãāăằắẵẳȧǡäǟảåǻǎȁȃạậặḁąⱥɐɑα");
        linkedHashMap.put("aa", "ꜳ");
        linkedHashMap.put("ae", "æǽǣ");
        linkedHashMap.put("ao", "ꜵ");
        linkedHashMap.put("au", "ꜷ");
        linkedHashMap.put("av", "ꜹꜻ");
        linkedHashMap.put("ay", "ꜽ");
        linkedHashMap.put("b", "bⓑｂḃḅḇƀƃɓ");
        linkedHashMap.put("c", "cⓒｃćĉċčçḉƈȼꜿↄ");
        linkedHashMap.put("ch", "χ");
        linkedHashMap.put("d", "dⓓｄḋďḍḑḓḏđƌɖɗꝺδ");
        linkedHashMap.put("dz", "ǳǆ");
        linkedHashMap.put("e", "eⓔｅèéêềếễểẽēḕḗĕėëẻěȅȇẹệȩḝęḙḛɇɛǝε");
        linkedHashMap.put("f", "fⓕｆḟƒꝼφ");
        linkedHashMap.put("ff", "ﬀ");
        linkedHashMap.put("fi", "ﬁ");
        linkedHashMap.put("fl", "ﬂ");
        linkedHashMap.put("ffi", "ﬃ");
        linkedHashMap.put("ffl", "ﬄ");
        linkedHashMap.put("g", "gⓖｇǵĝḡğġǧģǥɠꞡᵹꝿγ");
        linkedHashMap.put("h", "hⓗｈĥḣḧȟḥḩḫẖħⱨⱶɥ");
        linkedHashMap.put("hv", "ƕ");
        linkedHashMap.put("i", "iⓘｉìíîĩīĭïḯỉǐȉȋịįḭɨıι");
        linkedHashMap.put("j", "jⓙｊĵǰɉ");
        linkedHashMap.put("k", "kⓚｋḱǩḳķḵƙⱪꝁꝃꝅκ");
        linkedHashMap.put("l", "lⓛｌŀĺľḷḹļḽḻſłƚɫⱡꝉꞁꝇλ");
        linkedHashMap.put("lj", "ǉ");
        linkedHashMap.put("m", "mⓜｍḿṁṃɱɯμ");
        linkedHashMap.put("n", "nⓝｎǹńñṅňṇņṋṉƞɲŉꞑꞥлԉν");
        linkedHashMap.put("nj", "ǌ");
        linkedHashMap.put("o", "߀oⓞｏòóôồốỗổõṍȭṏōṑṓŏȯȱöȫỏőǒȍȏơờớỡởợọộǫǭøǿɔꝋꝍɵο");
        linkedHashMap.put("oe", "Œœ");
        linkedHashMap.put("oi", "ƣ");
        linkedHashMap.put("ou", "ȣ");
        linkedHashMap.put("oo", "ꝏ");
        linkedHashMap.put("p", "pⓟｐṕṗƥᵽꝑꝓꝕπ");
        linkedHashMap.put("ps", "ψ");
        linkedHashMap.put("q", "qⓠｑɋꝗꝙ");
        linkedHashMap.put("r", "rⓡｒŕṙřȑȓṛṝŗṟɍɽꝛꞧꞃρ");
        linkedHashMap.put("s", "sⓢｓśṥŝṡšṧṣṩșşȿꞩꞅẛσς");
        linkedHashMap.put("ss", "ß");
        linkedHashMap.put("t", "tⓣｔṫẗťṭțţṱṯŧƭʈⱦꞇτ");
        linkedHashMap.put("th", "þθ");
        linkedHashMap.put("tz", "ꜩ");
        linkedHashMap.put("u", "uⓤｕùúûũṹūṻŭüǜǘǖǚủůűǔȕȗưừứữửựụṳųṷṵʉ");
        linkedHashMap.put("v", "vⓥｖṽṿʋꝟʌβ");
        linkedHashMap.put("vy", "ꝡ");
        linkedHashMap.put("w", "wⓦｗẁẃŵẇẅẘẉⱳ");
        linkedHashMap.put("x", "xⓧｘẋẍξ");
        linkedHashMap.put("y", "yⓨｙỳýŷỹȳẏÿỷẙỵƴɏỿυ");
        linkedHashMap.put("z", "zⓩｚźẑżžẓẕƶȥɀⱬꝣζ");
        this.f131129a = linkedHashMap;
        this.f131130b = w.y0(new e(this, 11));
    }

    @Override // f0m.a
    public final String a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        char[] charArray = text.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return kotlin.collections.d.b0(charArray, new eu7.c(this, 29), 30);
    }
}
