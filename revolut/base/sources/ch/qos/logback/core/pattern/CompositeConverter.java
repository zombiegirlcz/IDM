package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class CompositeConverter<E> extends DynamicConverter<E> {
    Converter<E> childConverter;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e) {
        StringBuilder sb6 = new StringBuilder();
        for (Converter<E> converter = this.childConverter; converter != null; converter = converter.next) {
            converter.write(sb6, e);
        }
        return transform(e, sb6.toString());
    }

    public Converter<E> getChildConverter() {
        return this.childConverter;
    }

    public void setChildConverter(Converter<E> converter) {
        this.childConverter = converter;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("CompositeConverter<");
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo != null) {
            sb6.append(formatInfo);
        }
        if (this.childConverter != null) {
            sb6.append(", children: ");
            sb6.append(this.childConverter);
        }
        sb6.append(">");
        return sb6.toString();
    }

    public abstract String transform(E e, String str);
}
